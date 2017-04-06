package com.spoloborota.ocp.time;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TimeTests {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(ZonedDateTime.now());
		
		LocalDate localDate = LocalDate.of(2017, Month.APRIL, 4);
		System.out.println(localDate);
		
		LocalTime localTime = LocalTime.of(11, 21, 34, 300000000);
		System.out.println(localTime);
		
		LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
		System.out.println(localDateTime);
		
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		
		System.out.println(ZoneId.getAvailableZoneIds().stream().findFirst().get());
		
		System.out.println(zonedDateTime.plusYears(20).getDayOfWeek());
		
		System.out.println(localDate.getDayOfYear());
		System.out.println(localDate.getEra());
		
		System.out.println(localDateTime.toLocalTime());
		
		LocalDate ld1 = LocalDate.of(2017, 1, 1);
		
		LocalDate ld2 = LocalDate.of(2019, 1, 1);
		
		Period period = Period.between(ld1, ld2);
		System.out.println(period);
		
		Period p2 = Period.of(2, 3, 0);
		System.out.println(p2);
		
		System.out.println(ld1.plus(p2));
		System.out.println(ld1.isBefore(LocalDate.now()));
		
		System.out.println(p2.plus(p2).plusDays(2));
		
		
		Duration duration = Duration.of(20, ChronoUnit.HALF_DAYS);
		System.out.println(duration.plusSeconds(38));
		
		System.out.println(Duration.between(localDateTime, LocalDateTime.now()));
		
		System.out.println(zonedDateTime.minus(duration));
		
		Instant instant = Instant.MAX;
		System.out.println(instant);
		
		System.out.println(Instant.now());
		System.out.println(ZonedDateTime.now().toInstant());
		System.out.println(LocalDateTime.now());
		
//		System.out.println(localDate.format(DateTimeFormatter.ISO_LOCAL_TIME));
		
		String m1 = Duration.of(70, ChronoUnit.MINUTES).toString();
		String m2 = Duration.ofMinutes(70).toString();
		String s = Duration.of(70, ChronoUnit.SECONDS).toString();
		
		System.out.println(m1 + " " + m2 + " " + s);
		
		System.out.println(Period.ofWeeks(45));
		System.out.println(Period.ofMonths(60));
		System.out.println(Duration.ofMinutes(70));
		
		Instant.ofEpochSecond(6000);
		
		LocalDate l1 = LocalDate.of(2015, 3, 20);
		LocalDate l2 = LocalDate.of(2015, 2, 20);
		System.out.println(Period.between(l1, l2));
		
		LocalTime t1 = LocalTime.of(10, 00);
		LocalTime t2 = LocalTime.of(2, 00);
		System.out.println(Duration.between(t1, t2));
		
		
		LocalDateTime ldz1 = LocalDateTime.of(2015, Month.MARCH, 8, 2, 0); 
		ZonedDateTime zd1 = ZonedDateTime.of(ldz1, ZoneId.of("US/Eastern")); 
		LocalDateTime ldz2 = LocalDateTime.of(2015, Month.MARCH, 8, 3, 0); 
		ZonedDateTime zd2 = ZonedDateTime.of(ldz2, ZoneId.of("US/Eastern")); 
		long x = ChronoUnit.HOURS.between(zd1, zd2); System.out.println(x);
	}

}
