package week1.day1;

public class TwoWheeler {

	    int noOfWheels =10;
		short noOfMirrors =20;
		long chasisNumber=25987654321l;
		boolean isPunctured =true;
		String bikeName = "Herohonda";
		double runningKm= 14.59;
			
			public static void main(String[] args) {
				TwoWheeler tw =new TwoWheeler();
				System.out.println("The number of wheels is:" +tw.noOfWheels);
				System.out.println("The number of Mirrors is:" +tw.noOfMirrors);
				System.out.println("The number of chasis is:" +tw.chasisNumber);
				System.out.println("The status of bike is:" +tw.isPunctured);
				System.out.println("The bike Name is:" +tw.bikeName);
				System.out.println("The running KM is:" + tw. runningKm);
				
			}
		
	}


