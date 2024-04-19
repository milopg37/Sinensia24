package semana2.pruebasfechas;

import java.security.PublicKey;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		presentarFechaYHoraActual();
		System.out.println("***");
		
		presentarFechaYHoraEnEuropaMadrid();
		System.out.println("***");
		
		presentarFechaConFormato();
		System.out.println("***");
		
		indicarMesCorrespondeAFecha();
		System.out.println("***");
		
		comprobarSiAnhoDadoEsBisiesto();
		System.out.println("***");
		
		comprobarPonerDiaAFecha();
		System.out.println("***");
		
		sumarDiasAFecha();
		System.out.println("***");
		
		sumaMesAFecha();
		System.out.println("***");
		
		calcularDiasEntreFechas();
		System.out.println("***");
		
		calcularMesesEntreFechas();
		System.out.println("***");
		
		calcularAnhosEntreFechas();
		System.out.println("***");

		calculasHorasEntreFechas();
		System.out.println("***");
		
		calcularPeriodoEntreFechas();
		System.out.println("***");
		
		sumarPeriodoAFecha();
		System.out.println("***");
		
		checkDiaSemanaFechaDada();
		System.out.println("***");
		
		checkDiaSemanaTresDiasAtras();
		System.out.println("***");
		
		indicarNombreMesActual();
		System.out.println("***");

		checkDiaSemanaFechaEspecifica();
		System.out.println("***");
		
		printearFechaConDiasYAnhoDado();
		System.out.println("***");
		
		segundosTranscurridosEntreHoras();
		System.out.println("***");
	}
	

	private static void presentarFechaYHoraActual() {

		LocalTime ahora = LocalTime.now();
		LocalDate hoy = LocalDate.now();

		System.out.println("Hora Actual: " + ahora);
		System.out.println("Fecha Actual: " + hoy);
		System.out.println("");
	}

	private static void presentarFechaYHoraEnEuropaMadrid() {
		ZoneId zonaHorariaId = ZoneId.of("Europe/Madrid");
		ZonedDateTime fechaHoraEuropaMadrid = ZonedDateTime.now(zonaHorariaId);
		System.out.println("Fecha y Hora en Europa/Madrid: " + fechaHoraEuropaMadrid);
	}

	private static void presentarFechaConFormato() {
		DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Presentar fecha con el formato 10/12/2022: " + formateador.format(LocalDateTime.now()));
	}


	private static void indicarMesCorrespondeAFecha() {
		// Indicar a que mes corresponde el 7/12/2020, en numero y el nombre
		LocalDateTime fechaYHoraEspecifica = LocalDateTime.of(2022, 12, 07, 16, 24);
		int mes = fechaYHoraEspecifica.getMonthValue();
		String nombreMes = fechaYHoraEspecifica.getMonth().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("es-ES"));
		System.out.println("Indicar a que mes corresponde el 7/12/2020: " + " Corresponde al mes: " + mes + " nombre del mes: " + nombreMes);
	}

	private static void comprobarSiAnhoDadoEsBisiesto() {
		// Comprobar si el año 2022 es bisiesto
		LocalDate fechaDada = LocalDate.of(2022, 10, 10);
		int anhoAComprobar = fechaDada.getYear();
		
		System.out.println("Comprobar si el año 2022 es bisiesto");
		
		if (Year.isLeap(anhoAComprobar)) {
			System.out.println("El año " + anhoAComprobar + " ES bisiesto");
		} else {
			System.out.println("El año " + anhoAComprobar + " NO es bisiesto");
		}
	}

	/**
	 * COREGIR
	 */
	private static void comprobarPonerDiaAFecha() {
		// Comprobar si puedo poner el dia 29 a 2/2020
		LocalDate agregarDiaAFecha = LocalDate.of(2020, 02, 29);
		System.out.println("Comprobar si puedo poner el dia 29 a 2/2020");
		System.out.println(agregarDiaAFecha);
	}
	

	private static void sumarDiasAFecha() {
		// Ver que fecha es 30 días después del 20/2/2010
		LocalDate fechaASumarDias = LocalDate.of(2010, 02, 20);
		LocalDate fechaSumaDate = fechaASumarDias.plusDays(30);
		System.out.println("Ver que fecha es 30 días después del 2010/02/20");
		System.out.println("Fecha original: " + fechaASumarDias + " fecha + 30 dias: " + fechaSumaDate);
	}
	
	private static void sumaMesAFecha() {
		// Ver que fecha es 1 mes después del 15/12/2009
		LocalDate fechaASumarMes = LocalDate.of(2009, 12, 15);
		LocalDate fechaSumada = fechaASumarMes.plusMonths(1);
		System.out.println("Ver que fecha es 1 mes después del 2009/15/12");
		System.out.println("Fecha original: " + fechaASumarMes + " fecha + 30 dias: " + fechaSumada);
	}
	
	/**
	 * Usar betweeen con LocalDate para las comparaciones entre fechas
	 */
	private static void calcularDiasEntreFechas() {
		// Calcular cuantos días han pasado entre el 7/10/2001 y el 10/5/2004
		System.out.println("Calcular cuantos días han pasado entre el 7/10/2001 y el 10/5/2004");
		
		ZonedDateTime primeraFecha = ZonedDateTime.of(2001, 10, 7, 0, 0, 0, 0, ZoneId.of("Europe/Madrid"));
		ZonedDateTime segundaFecha = ZonedDateTime.of(2004, 5, 10, 0, 0, 0, 0, ZoneId.of("Europe/Madrid"));
		
		long diasDiferencia = ChronoUnit.DAYS.between(primeraFecha, segundaFecha);
		System.out.println("Dias transcurridos entre las fechas: " + primeraFecha + " & " + segundaFecha + " : " + diasDiferencia + " dias transcurridos");
	}
	

	private static void calcularMesesEntreFechas() {
		// Calcular cuantos meses han pasado entre el 7/10/2001 y el 10/5/2004
		System.out.println("Calcular cuantos meses han pasado entre el 7/10/2001 y el 10/5/2004");
		
		ZonedDateTime primeraFecha = ZonedDateTime.of(2001, 10, 7, 0, 0, 0, 0, ZoneId.of("Europe/Madrid"));
		ZonedDateTime segundaFecha = ZonedDateTime.of(2004, 5, 10, 0, 0, 0, 0, ZoneId.of("Europe/Madrid"));
		
		long mesesDiferencia = ChronoUnit.MONTHS.between(primeraFecha, segundaFecha);
		System.out.println("Meses transcurridos entre las fechas: " + primeraFecha + " & " + segundaFecha + " : " + mesesDiferencia + " meses");
	}


	private static void calcularAnhosEntreFechas() {
		// Calcular cuantos años han pasado entre el 7/10/2001 y el 10/5/2004
		System.out.println("Calcular cuantos años han pasado entre el 7/10/2001 y el 10/5/2004");
		
		ZonedDateTime primeraFecha = ZonedDateTime.of(2001, 10, 7, 0, 0, 0, 0, ZoneId.of("Europe/Madrid"));
		ZonedDateTime segundaFecha = ZonedDateTime.of(2004, 5, 10, 0, 0, 0, 0, ZoneId.of("Europe/Madrid"));
		
		long anhosDiferencia = ChronoUnit.YEARS.between(primeraFecha, segundaFecha);
		System.out.println("Años transcurridos entre las fechas: " + primeraFecha + " & " + segundaFecha + " : " + anhosDiferencia + " años");
		
	}
	
	private static void calculasHorasEntreFechas() {
		// Calcular cuantas horas han pasado entre el 7/10/2001 y el 10/5/2004
		System.out.println("Calcular cuantas horas han pasado entre el 7/10/2001 y el 10/5/2004");
		
		ZonedDateTime primeraFecha = ZonedDateTime.of(2001, 10, 7, 0, 0, 0, 0, ZoneId.of("Europe/Madrid"));
		ZonedDateTime segundaFecha = ZonedDateTime.of(2004, 5, 10, 0, 0, 0, 0, ZoneId.of("Europe/Madrid"));
		
		long horasDiferencia = ChronoUnit.HOURS.between(primeraFecha, segundaFecha);
		System.out.println("Horas transcurridas entre las fechas: " + primeraFecha + " & " + segundaFecha + " : " + horasDiferencia + " horas");
	}
	
	private static void calcularPeriodoEntreFechas() {
		// Calcular el periodo que existe entre 3/2/2020 y el 5/7/2021
		System.out.println("Calcular el periodo que existe entre 3/2/2020 y el 5/7/2021");
		LocalDate fechaInicio = LocalDate.of(2020, 2, 3);
		LocalDate fechaFin = LocalDate.of(2021, 7, 5);
		
		Period period = Period.between(fechaInicio, fechaFin);
		int anhos = period.getYears();
		int meses = period.getMonths();
		int dias = period.getDays();
		System.out.println("Periodo transcurrido entre las fechas " + fechaInicio + " & " + fechaFin
							+ " Años:" + anhos + " Meses:" + meses + " dias:" + dias);
	}
	

	private static void sumarPeriodoAFecha() {
		// Ver que fecha sale si sumamos el periodo anterior a la fecha 12/11/2022
		System.out.println("Ver que fecha sale si sumamos el periodo anterior a la fecha 12/11/2022");
		
		LocalDate fechaAnhadirPeriodo = LocalDate.of(2022, 11, 12);
		//El periodo de apartado anterior era 1 año 5 meses y 2 dias
		fechaAnhadirPeriodo = fechaAnhadirPeriodo.plusYears(1);
		fechaAnhadirPeriodo = fechaAnhadirPeriodo.plusMonths(5);
		fechaAnhadirPeriodo = fechaAnhadirPeriodo.plusDays(2);
		System.out.println("Fecha despues de añadir el periodo de 1 año 5 meses y 2 dias: " + fechaAnhadirPeriodo);
	}

	private static void checkDiaSemanaFechaDada() {
		// Ver que día de la semana era el 22/4/2022
		System.out.println("Ver que día de la semana era el 22/4/2022");
		LocalDate fechaDada = LocalDate.of(2022, 4, 22);
		System.out.println("Dia de la semana en la fecha dada: " + fechaDada + " Dia: " + fechaDada.getDayOfWeek());
	}

	private static void checkDiaSemanaTresDiasAtras() {
		//Ver que día de la semana era hace tres días
		System.out.println("Ver que día de la semana era hace tres días");
		LocalDate fechaActual = LocalDate.now();
		System.out.println("Dia de la semana 3 dias atras respecto a la fecha actual: " + fechaActual.minusDays(3).getDayOfWeek());
	}
	
	private static void indicarNombreMesActual() {
		// Indicar el nombre en castellano del mes actual
		System.out.println("Indicar el nombre en castellano del mes actual");
		LocalDate fechaActual = LocalDate.now();
		String mesActual = fechaActual.getMonth().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("es-ES"));
		System.out.println("Nombre del mes actual en castellano: " + mesActual);
	}
	
	private static void checkDiaSemanaFechaEspecifica() {
		// Ver que día de la semana era el primer día del mes de octubre de 1940
		System.out.println("Ver que día de la semana era el primer día del mes de octubre de 1940");
		LocalDate fechaAntigua = LocalDate.of(1940, 10, 1);
		System.out.println("Dia de la semana que corresponde al primer dia de mes octubre de 1940: " + 
							fechaAntigua.getDayOfWeek());
	}

	private static void printearFechaConDiasYAnhoDado() {
		// Presentar la fecha correspondiente al día 253 del año 1989s
		System.out.println("Presentar la fecha correspondiente al dia 253 del año 1989");
		LocalDate fechaCorrespondiente = LocalDate.of(1989, 1, 0).withDayOfYear(253);
		System.out.println(fechaCorrespondiente);	
	}
	
	private static void segundosTranscurridosEntreHoras() {
		// Cuantos segundos han pasado desde las 10:15 hasta las 12:30
		System.out.println("Cuantos segundos han pasado desde las 10:15 hasta las 12:30");
		LocalTime horaInicio = LocalTime.of(10, 15);
		LocalTime horaFin = LocalTime.of(12, 30);
		long segundosDiff = ChronoUnit.SECONDS.between(horaInicio,horaFin);
		
		System.out.println("Diferencia en segundos entre la hora " + horaInicio + " y la hora " + horaFin + ": " + segundosDiff + " segundos");
	}
}
