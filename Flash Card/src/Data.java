import java.util.ArrayList;
public class Data
	{
	 static ArrayList <Card> questionBoard = new ArrayList <Card>();
	 public static void testing()
			{
			questionBoard.add(new Card("Instantiate an int array.", "int [] myArray = new int[x];"));
			questionBoard.add(new Card("Add an int to the array above.", "myArrayno[y] = n;"));
			questionBoard.add(new Card("Given an int array, print out one of the elements.", "System.out.println(myArray[q]);"));
			questionBoard.add(new Card("Instantiate a 2-D String array", "String myArray [][] = new String[r][c]"));
			questionBoard.add(new Card("Add a String to the array above", "myArray[x][y] = \"words\"; "));
			questionBoard.add(new Card("Given a 2-D String array, print out one of the elements", "System.out.println(myArray[d][i])"));
			questionBoard.add(new Card("Write a constructor of the Player class and pass an int, a String, and a double as parameters", "public class Player \n { \n Private String name; \n Private int age; \n Private double score \n public Player(String n, int a, double s) \n { \n name = n; \n age = a; \n score = s; \n } \n }"));
			questionBoard.add(new Card("Create a getter for a String variable out of the constructor above", "public String getname() \n { \n return name; \n }"));
			questionBoard.add(new Card("Instantiate an ArrayList of Player objects", "ArrayList<Player>myArray = new Arraylist<Player>();"));
			questionBoard.add(new Card("Add a new Player object to the ArrayList above", "myArrayList.add(new Player)(\"new information\", \"new information\"));"));
			questionBoard.add(new Card("Given an ArrayList of player objects, print out a specific field of a specific object- Print out age.", "System.out.println(Player.myArray.get(index).getage());"));
			}
	}
