package snakeladder;

public class die {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int dice1;
     int dice2;
     dice1=(int)(Math.random()*6)+1;
     dice2=(int)(Math.random()*6)+1;
     System.out.println("player1 :" +dice1);
     System.out.println("player2 :" +dice2);
	}

}
