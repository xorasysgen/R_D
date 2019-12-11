package code.date.tricks;

public class FamilyCount {

	public static int countMember(int n, int x, int [] db) {
		int count=0;
		for(int k=0; k<n; k++) {
			if(db[k]==0 && db[k]<=x) {
				count++;
			}
			else if(db[k]==-1 && x==0)
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		//int [] db= {-1};
		int [] db= {-1,0,0};
		int n=3;
		int x=1;
		System.out.println(FamilyCount.countMember(n, x, db));
	}

}
