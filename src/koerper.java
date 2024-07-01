import java.util.Scanner;

public class koerper {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {

			while (true) {
				System.out.println("please choose an objekt (cy)linder, (c)ube, (cu)boid, (ci)rcular cone, (g)lobe");
				String chose = scanner.nextLine().toLowerCase();

				switch (chose) {

					case "cy" -> {
						System.out.print("Please specify the radius of the Cylinder:");
						int r_cy = scanner.nextInt();

						System.out.print("Please specifyc the hight of the Cylinder:");
						int h_cy = scanner.nextInt();

						double V_cy = Math.PI * Math.pow(r_cy, 2) * h_cy;
						double S_cy = 2 * Math.PI * r_cy * (r_cy + h_cy);

						double rV_cy = Math.round(V_cy * 100) / 100.0;
						double rS_cy = Math.round(S_cy * 100) / 100.0;

						System.out.println("The rounded Volume of the cylinder is: " + rV_cy
								+ "\nThe rounded Surface area of the cylinder is: " + rS_cy);
						scanner.nextLine();
					}

					case "c" -> {
						System.out.print("Please specify the edge length of the cube:");
						int a_c = scanner.nextInt();

						double V_c = Math.pow(a_c, 3);
						double S_c = 6 * Math.pow(a_c, 2);

						double rV_c = Math.round(V_c * 100) / 100.0;
						double rS_c = Math.round(S_c * 100) / 100.0;

						System.out.println("The rounded Volume of the cube is: " + rV_c
								+ "\nThe rounded Surface area of the cube is: " + rS_c);
						scanner.nextLine();
					}

					case "cu" -> {
						System.out.print("PLease specify the length of the cuboid:");
						int a_cu = scanner.nextInt();

						System.out.print("PLease specify the widht of the cuboid:");
						int b_cu = scanner.nextInt();

						System.out.print("PLease specify the high of the cuboid:");
						int h_cu = scanner.nextInt();

						double V_cu = a_cu * b_cu * h_cu;
						double S_cu = 2 * (a_cu * b_cu + a_cu * h_cu + b_cu * h_cu);

						double rV_cu = Math.round(V_cu * 100) / 100.0;
						double rS_cu = Math.round(S_cu * 100) / 100.0;

						System.out.println("The rounded Volume of the cuboid is: " + rV_cu
								+ "\nThe rounded Surface area of the cuboid is: " + rS_cu);
						scanner.nextLine();
					}

					case "ci" -> {
						System.out.print("PLease specify the radius of the base of the circular cone:");
						int r_ci = scanner.nextInt();

						System.out.print("PLease specify the bevel of the high of the circular cone:");
						int s_ci = scanner.nextInt();

						double V_ci = Math.PI * Math.pow(r_ci, 2) * 1 / 3;
						double S_ci = Math.PI * Math.pow(r_ci, 2) + Math.PI * r_ci * s_ci;

						double rV_ci = Math.round(V_ci * 100) / 100.0;
						double rS_ci = Math.round(S_ci * 100) / 100.0;

						System.out.println("The rounded Volume of the circular cone is: " + rV_ci
								+ "\nThe rounded Surface area of the circular cone is: " + rS_ci);
						scanner.nextLine();
					}

					case "g" -> {
						System.out.print("PLease specify the radius of the globe:");
						int r_g = scanner.nextInt();

						double V_g = Math.PI * Math.pow(r_g, 2) * 4 / 3;
						double S_g = 4 * Math.PI * Math.pow(r_g, 2);

						double rV_g = Math.round(V_g * 100) / 100.0;
						double rS_g = Math.round(S_g * 100) / 100.0;

						System.out.println("The rounded Volume of the globe  is: " + rV_g
								+ "\nThe rounded Surface area of the globe  is: " + rS_g);
						scanner.nextLine();
					}

					default -> System.out.println(
							"!!YOUR SPECIFIC LETTER IS INCORECT. TRY AGAIN!!");

				}
			}
		}
	}
}
