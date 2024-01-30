package javaTutorial23Enum;
// Made on 01 / 29 / 2024
public class Main {

	public static void main(String[] args) {
		AILevel level = AILevel.HARD;
		
		USCurrency[] coins = new USCurrency[4];
		coins[0] = USCurrency.DIME;
		coins[1] = USCurrency.NICKLE;
		coins[2] = USCurrency.PENNY;
		coins[3] = USCurrency.QUARTER;
		
		for(USCurrency coin : coins) {
			System.out.println(coin.name());
		}
		
		
		
		/*
		if(level == AILevel.EASY) {
			System.out.println("For Babies");
		}else if (level == AILevel.MEDIUM) {
			System.out.println("For Kids");
		}else if(level == AILevel.HARD) {
			System.out.println("For Men");
		}
		
		switch(level) {
		case EASY:
			System.out.println("For Babies");
			break;
		case MEDIUM:
			System.out.println("For Kids");
			break;
		case HARD:
			System.out.println("For Men");
			break;
		}
		*/

	}

}
