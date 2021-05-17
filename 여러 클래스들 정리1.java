
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class practice {
	public static void main(String[] args) {	
		//Math class
		//Math class , java.lang 패키지에 있음 -> 자동 import됨 , 모든 메소드 static
		System.out.println(Math.E);//자연 지수 e값
		System.out.println(Math.PI);//원주율
		
		int p=Math.abs(-23); //절대값 반환, double 지원
		
		double xp=Math.ceil(2.27); //2.27보다 큰 정수중 가장 작은 정수 double 반환
		double xp2=Math.floor(2.27);// 2.27보다 작은 정수중 가장 큰 정수 double형 반환
		System.out.println(Math.round(2.272));//반올림. 소수  첫째자리에서 반올림. int 형반환
		double p2=Math.sqrt(2);//루트2
		
		double temp=Math.random();//0이상 1미만 랜덤 소수 생성기
		
		double result=Math.log10(1000);//밑이 10인 로그
		double re=Math.log(1000);//밑이 e인  
		
		System.out.println(Math.pow(2.0, 3));//2^3, 출력은 double임
		
		
		double radian45=Math.toRadians(45);//45도를 라디안값으로 변경. //sin cos tan 입력값은 라디안 double임.
		System.out.printf("Sin45 : %.2f, Cos45 : %.2f, Tan45: %.2f\n",Math.sin(radian45),Math.cos(radian45),Math.tan(radian45));
		
		
		//Random class
		System.out.println("================================================================");
		
		Random rand=new Random();//실행할때마다 랜덤생성, 랜덤 클래스는 not static 임
		for (int i=0;i<5;i++) {
			System.out.print(rand.nextInt(46)+" ");//nextLong nextFloat nextDouble도 비슷함
			//공백으로 두면 그 기본타입 의 min~max값 사이에 나옴. 입력시 0부터 입력값까지
		}
		System.out.println("================================================================");
		//StringTokenizer class
		//하나의 문자열을 구분자 기준으로 여러 문자열로 분리하는데 사용함. import 필요, 공백이 기본 구분자
		StringTokenizer st1=new StringTokenizer("PM:03:52",":");
		while(st1.hasMoreTokens()) {
			System.out.print((st1.nextToken()+" "));
		}
		System.out.println();
		
		StringTokenizer st2=new StringTokenizer("52 + 43 - 6 / 2 = 92","+-/= ");//다양한 분리 기준 사용이 가능 이경우는 +-/= 와 공백 이 분리기준
		//혹은 String.split을 이용해도 됨 
		ArrayList<String> s=new ArrayList<>();
		for (int i=0;st2.hasMoreTokens();i++) {
			s.add(st2.nextToken());
			System.out.print(s.get(i)+' ');
	
		}
	// Calender class
		// 시스템에 설정된 날짜와 시간 관련 기능 제공 - 추상클래스 : 인스턴스생성불가
		//java.util패키지에 정의됨
		System.out.println("===============================================================");
		System.out.println("===============================================================");
		
		Calendar cal=Calendar.getInstance();
		Calendar birthday=Calendar.getInstance();
		//추상 클래스이므로 new 사용 불가능함. cal 객체가 현재 날짜와 시간 정보 가지고 생성. 상속받은 CregorianCalender 클래스를 통해 현재 시간/날짜 정보 가진 객체 생성
		System.out.println(cal);//그레고리력 이용. 0년 0월 0일 0시 0분 0초가 기준
		int y=cal.get(Calendar.YEAR);//지정된 값을 반환하는 방식임. 전부 int형임 시분초 까지도
		int m=cal.get(Calendar.MONTH)+1;//1월이 0의 값 가짐
		int d=cal.get(Calendar.DATE);
		int ampm=cal.get(Calendar.AM_PM);
		//HOUR MINUTE SECOND 동일
		
		birthday.set(Calendar.YEAR, 1998);
		birthday.set(Calendar.MONTH, 8);
		birthday.set(Calendar.MONTH, 23);//set 메소드. 객체의 년/월/일을 직접 지정함 , 시분초도 동일
		
		System.out.println(birthday.before(cal));//cal 입력시간 기준 birthday 객체가 먼저 앞이면 true 아니면 false
		//after 기능도 있음.
		
		System.out.println((ampm==Calendar.AM) ? "오전":"오후");
		System.out.println("===============================================================");
		
        System.out.printf("%tF\n",cal); // 2018-07-10        -> 오늘 날짜
        System.out.printf("%tT\n",cal); // 09:37:24            -> 현재 시각
        System.out.printf("%tA\n",cal); // 화요일            -> now안에 들어있는 요일
        System.out.printf("%tR\n",cal); // 09:32            -> 초를 버린 시간과 분
        System.out.printf("%tr\n",cal); // 09:32:01 오전    -> 오전, 시 분 초 나옴.
		
        System.out.println("===============================================================");
        
        Date today=birthday.getTime();//Calendar 객체에 담긴 년월일시분초를 Date 형태로 반환함. 
        birthday.add(Calendar.DATE, 100);//birthday 에 지정된 날에 100일을 추가함. 이전으로 돌리고 싶으면 -100 하기
        birthday.clear();//객체에 담긴 시간정보 완전 삭제, 괄호 안에 calendar 필드 종류 입력시 그 부분만 제거
		//SimpleDateFormat class - Date Class와 같이 많이씀. 날짜나  시간에 관련된 정보를 출력해줌
		//
		
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy.MM.dd EEE");//형식을 입력하는 방식임
		SimpleDateFormat sdf2=new SimpleDateFormat("hh시 m분 ss초 u");
		System.out.println((new SimpleDateFormat()).format(new Date()));
		System.out.println(sdf1.format(new Date()));
		System.out.println(sdf2.format(new Date()));
		System.out.println(sdf1.format(today));
	}
	
}
