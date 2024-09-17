package practice;

public class ifdifferwhile {
public static void main(String[] args) {
	int month=4;
	int day=1;
	while(month==4) {
		System.out.println("play"+day);
		day=day+1;
		if(day>31) {
			month=month+1;
		}
	}
}
}
