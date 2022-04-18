package com.quintrix.jfs;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Streams {

	public static void main(String[] args) {
		//print all cast of the hit tv show the office
		officeCast.stream().forEach(x -> System.out.println(x));
		
		//counts all cast members <count><Terminal>
		long countCast = officeCast.stream().count();
		System.out.println(countCast);
		
		//Prints all cast members that begin with the letter D <filter><Intermediate> and <forEach><Terminal>
		officeCast.stream().filter(x -> x.startsWith("D")).forEach(x -> System.out.println(x));
		
		//print the first cast member name that begins with the letter D <findFirst><Terminal>
		officeCast.stream().filter(x -> x.startsWith("D")).findFirst().ifPresent(x -> System.out.println(x));
		
		//add name: to cast <map><Intermediate>
		officeCast.stream().map(x -> x = "Name: " + x).forEach(x -> System.out.println(x));
		
		//prints only 5 cast members <limit><Intermediate>
		officeCast.stream().limit(5).forEach(x -> System.out.println(x));
	}
	
	
static List<String> officeCast = Arrays.asList("Dwight Schrute",
		"Jim Halpert",
		"Pam Beesly",
		"Stanley Hudson",
		"Kevin Malone",
		"Angela Martin",
		"Phyllis Vance",
		"Meredith Palmer",
		"Creed Bratton",
		"Oscar Martinez",
		"Ryan Howard",
		"Kelly Kapoor",
		"Andy Bernard",
		"Toby Flenderson",
		"Michael Scott",
		"Darryl Philbin",
		"Erin Hannon",
		"Gabe Lewis",
		"Jan Levinson",
		"David Wallace",
		"Nellie Bertram",
		"Roy Anderson",
		"Karen Filippelli",
		"Robert California",
		"Bob Vance",
		"Hank",
		"Pete Miller",
		"Clark",
		"Nate",
		"Holly Flax",
		"Todd Packer",
		"Glenn",
		"Val",
		"Robert Lipton",
		"Mose",
		"Cathy Simms",
		"Helene",
		"Jo Bennett",
		"Hidetoshi Hasagawa",
		"Josh Porter",
		"Charles Miner",
		"Carol Stills",
		"Madge",
		"Hannah Smotridge-Barr",
		"Brian",
		"Donna",
		"Nick",
		"Esther",
		"Teri Hudson",
		"Cecelia Halpert",
		"Billy Merchant",
		"Deangelo Vickers",
		"Gil",
		"Jessica",
		"Rolf",
		"Isabel Poreba",
		"Troy",
		"Cynthia",
		"Stacy",
		"Devon White",
		"Katy",
		"Lonny",
		"Matt",
		"Tony Gardner",
		"Irene",
		"Jake Palmer",
		"Sasha Flenderson",
		"Elizabeth",
		"Jada",
		"Ravi",
		"Zeke",
		"Sensei Ira",
		"Martin",
		"Melvina",
		"Trevor",
		"Vikram",
		"Ronni",
		"Rachel Wallace",
		"Sadiq",
		"Penny Beesly",
		"Christian",
		"Jerome Bettis",
		"Julius Erving",
		"Clay Aiken",
		"Wally Amos",
		"Harry Jannerone",
		"Ryan Howard",
		"Mark McGrath",
		"Aaron Rodgers",
		"Santigo");
}
