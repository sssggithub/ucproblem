package snakeladder;

public class Winning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int dice;
     dice=(int)(Math.random()*6)+1;
     for(int player=dice;player<=100;player+=dice) {
    	 System.out.println("Player position" +player);
     }
	}

}
