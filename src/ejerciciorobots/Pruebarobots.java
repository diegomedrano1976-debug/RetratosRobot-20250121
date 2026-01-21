package ejerciciorobots;

import java.util.List;


public class Pruebarobots {
	public static void main(String[] args) {
		Robots robots = new pelo("WWWWWWWWW", List.of(new pelo("\\\\\\//////"), new pelo("|||||||"), new pelo("|||||||||")),4);
		System.out.println(robots);
		Robots robots = new robots("| o o |", List.of(new ojos("|-(· ·)-|"), new ojos("|-(o o)-|"), new ojos("| \\ / |")),4);
		System.out.println(robots);
		Robots robots = new robots("@ J @", List.of(new orejasnariz("{ \" }"), new orejasnariz("[ j ]"), new orejasnariz("< - >")),4);
		System.out.println(robots);
		Robots robots = new robots("| === |", List.of(new boca("| - |"), new boca("| --- |"), new boca("| ___ |")),4);
		System.out.println(robots);
		Robots robots = new robots("\\_______/", List.of(new barbilla("\\_______/")),2);
		System.out.println(robots);
	}
	
}
