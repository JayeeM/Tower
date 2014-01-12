
public class Game {
	static int bagX = 200, bagY = 500;
	static int presentX = 0, presentY = 0;
	static int bombX = 0, bombY = 0;
	
	static int presentCaught = 0;
	public static void main(String[] args) {
		Zen.create(400, 600);
		
		while(true) {
			drawBackground();
			drawPresent();
			drawBomb();
			drawBag();
			
			movePresent();
			moveBomb();
			moveBag();
			
			if (bombInBag()) {
				// You die!
			}
			if(presentInBag()) {
				presentCaught++;
				resetPresent();
				}
			
			Zen.flipBuffer();
			Zen.sleep(33);
		}
	}
	private static void resetPresent() {
		presentY = -50;
		presentX = (int) (Math.random() * 400);
	

	}
	/*public static boolean presentAtBottom() {
		if (presentY > 600) {
			return true;
		}
		return false;
	}  */ 
	
}
