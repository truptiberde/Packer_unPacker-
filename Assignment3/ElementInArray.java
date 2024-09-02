package Assignment3;

public class ElementInArray {

	public static void main(String[] args) {
	int[] array= {11,22,33,44,55,66,77};
	int target=99;
	boolean isPresent=false;
	for(int i=0;i<array.length;i++) {
		if(array[i]==target) {
			isPresent=true;
			break;
		}
	}
	if(isPresent) {
		System.out.println(target+" is present in the array.");
	}
	else {
		System.out.println(target+" is not present in the array.");
	}
}
}