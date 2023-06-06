package com.rays.Java8;

public class G_FunMixTest7a {
	public static void main(String[] args) {
		G_FunMix7 fm = new G_FunMix7() {

			@Override
			public void show() {
				System.out.println("This is default.....");
			}
			
		};
		fm.show();
		G_FunMix7.mult();
	}

}
