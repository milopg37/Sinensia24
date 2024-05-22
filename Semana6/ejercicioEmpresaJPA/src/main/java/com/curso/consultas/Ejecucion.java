package com.curso.consultas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.curso.modelos.Departamento;
import com.curso.modelos.Empleado;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class Ejecucion {

		static final EntityManagerFactory  emf = Persistence.createEntityManagerFactory("bdempresa");
		static final EntityManager em = emf.createEntityManager();
		
	  public static void main(String[] args) {
		  
		  //LLama al Persistence y este se encarga de ejecutar los primeros 3 scripts
          Persistence.generateSchema("bdempresa", null);
          
	  		System.out.println(" -- Ejecutando consulta 01 ..");
	  		ejecutarConsulta01();
	  		
	  		System.out.println(" -- Ejecutando consulta 02 ..");
	  		ejecutarConsulta02();
	  		
	  		System.out.println(" -- Ejecutando consulta 03 .. SKIPPED");
	  		//ejecutarConsulta03();
	  		
	  		System.out.println(" -- Ejecutando consulta 04 ..");
	  		ejecutarConsulta04();
	  		
	  		System.out.println(" -- Ejecutando consulta 05 .. FALLA");
	  		ejecutarConsulta05();
	  		
	  		System.out.println(" -- Ejecutando consulta 06 ..");
	  		ejecutarConsulta06();
	  		
	  		System.out.println(" -- Ejecutando consulta 07 ..");
	  		ejecutarConsulta07();
	  }
	

	/**
		 * Caso 1
		 * Crear nuevo departamento y crear 3 nuevos empleados
		 * Asignarles ese departamento a los empleados
		 */
	private static void ejecutarConsulta01() {
		em.getTransaction().begin();
		
		//Creo nuevo dept
		Departamento nuevoDepartamento = new Departamento(3, "soporte", "lugo");
		
		//Creo 3 nuevos Emps
		Empleado nuevoEmpleado1 = new Empleado(4, "Alvaro", new Date() , 24000);
		Empleado nuevoEmpleado2 = new Empleado(5, "Diego", new Date() , 26000);
		Empleado nuevoEmpleado3 = new Empleado(6, "Raquel", new Date() , 28000);
		
		//Asigno esos 3 empleados nuevos al nuevo dept (Tanto como propiedad objeto como propiedad id)
		nuevoEmpleado1.setDepartamento(nuevoDepartamento);
		nuevoEmpleado2.setDepartamento(nuevoDepartamento);
		nuevoEmpleado3.setDepartamento(nuevoDepartamento);
		
		
		//Creo una lista emp (propiedad de la clase dept)y agrego los 3
		List<Empleado> listaEmp = new ArrayList<Empleado>();
		listaEmp.add(nuevoEmpleado1);
		listaEmp.add(nuevoEmpleado2);
		listaEmp.add(nuevoEmpleado3);
		
		//Seteo la lista con los 3 a ese dept
		nuevoDepartamento.setEmpleados(listaEmp);
		
		em.persist(nuevoDepartamento);
		em.persist(nuevoEmpleado1);
		em.persist(nuevoEmpleado2);
		em.persist(nuevoEmpleado3);
		
		em.getTransaction().commit();
	}
	
		/**
		 * Caso 2
		 * Crear nuevo empleado y asignarle departamento existente
		 */
	  private static void ejecutarConsulta02() {
		  em.getTransaction().begin();
		  
		  //New empleado
		  Empleado nuevoEmpleado = new Empleado(7, "Raul", new Date() , 26000);
		  
		  //Consulta para traer departamentos existentes
		  TypedQuery<Departamento> consulta = em.createQuery("SELECT d FROM Departamento d WHERE d.nombre = 'informatica'", Departamento.class);
		  List<Departamento> resultado = consulta.getResultList();
		  
		  //Recorro los devueltos y le asigno un dept que cumpla condicion
		  for (Departamento departamento : resultado) {
			  if (departamento.getNombre().equalsIgnoreCase("informatica")) {
				  
				  nuevoEmpleado.setDepartamento(departamento);
			  }
		 }
		  em.persist(nuevoEmpleado);
		  em.getTransaction().commit();
	}
	  
	  	/**
		  * Caso 3
		  * Comparar fechas entre 2 empleados
		  */
		private static void ejecutarConsulta03() {
			
			System.out.println("Comparar entre fechas 2 empleados");
			Empleado empleado1 = em.find(Empleado.class, 1);
			Empleado empleado2 = em.find(Empleado.class, 2);
			
			if (empleado1.getFecha().after(empleado2.getFecha())) {
				
				System.out.println("Más antiguo: " + empleado2);
			}else {
				
				System.out.println("Más antiguo: " + empleado1);
			}
		}
		
		/**
  		 * Caso 4
  		 * Mostrar todos los departamentos
  		 */
		private static void ejecutarConsulta04() {
			
			TypedQuery<Departamento> consulta = em.createQuery("SELECT d FROM Departamento d", Departamento.class);
			List<Departamento> resultado = consulta.getResultList();
			
			for (Departamento departamento : resultado) {
				System.out.println(departamento.toString());
			}
		}
		
		/**
  		 * Caso 5
  		 * Seleccionar empleados de n departamento
  		 */
		private static void ejecutarConsulta05() {
			
			TypedQuery<Empleado> consulta = em.createQuery("SELECT e FROM Empleado e WHERE e.departamento.id_dept = :n", Empleado.class);
			consulta.setParameter('n', 3);//Quiero mostrar emp que pertenezcan a dept 3
			
			List<Empleado> resultado = consulta.getResultList();
			
			for (Empleado empleado : resultado) {
				System.out.println("Empleados que pertenecen al departamento con ID 3");
				System.out.println(empleado);
			}
		}
		
		
		/**
	  	 * Caso 6
	  	 * Seleccionar departamentos con empleados < n
	  	 */
		private static void ejecutarConsulta06() {
			
			TypedQuery<Departamento> consulta = em.createQuery("SELECT d FROM Departamento d", Departamento.class);
			List<Departamento> resultado = consulta.getResultList();
			
			for (Departamento departamento : resultado) {
				if (departamento.getEmpleados().size() <= 3) {
					System.out.println("Mostrando departamentos cuyos empleados sea menor que 3");
					System.out.println(departamento.getEmpleados());
				}
			}
		}
		
		/**
	  	 * Caso 7
	  	 * Seleccionar empleados con sueldo < promedio
	  	 */
		private static void ejecutarConsulta07() {
			
			em.getTransaction().begin();
			
			//Primera parte, hayo promedio sueldo
			TypedQuery<Double> consulta = em.createQuery("SELECT AVG(e.sueldo) AS sueldo_promedio FROM Empleado e", Double.class);
			double sueldoPromedio = consulta.getSingleResult();
			
			//Segunda parte, traigo empleados y comparo por promedio
			TypedQuery<Empleado> consultaEmp = em.createQuery("SELECT e FROM Empleado e", Empleado.class);
			List<Empleado> resultado = consultaEmp.getResultList();
			
			for (Empleado empleado : resultado) {
				if (empleado.getSueldo() < sueldoPromedio) {
					System.out.println("Este empleado cobra menos que el promedio:");
					System.out.println(empleado);
				}
			}
			em.getTransaction().commit();
		}
}
