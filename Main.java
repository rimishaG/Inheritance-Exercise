public class Main {

    public static void main(String[] args) {

	JeepWrangler jeepWrangler = new JeepWrangler(60);
	jeepWrangler.steer(45);
	jeepWrangler.accelerate(30);
	jeepWrangler.accelerate(20);
	jeepWrangler.accelerate(-40);
    }
}
