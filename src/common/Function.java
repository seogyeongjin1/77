package common;

public class Function {
   //로그인 
   public static final int LOGIN=100;// 이미 로그인된 사람들
   //방관련 메세지
   public static final int MYLOG=110;// 로그인하는 사람들
   public static final int MAKEROOM=200;// 방만들기
   public static final int ROOMIN=210;//방들어가기
   public static final int ROOMOUT=220;//방나가기(남아있는 사람)
   public static final int MYROOMOUT=230;//방나가는 사람 처리
   public static final int WAITUPDATE=240;//대기실 수정
   //GAME 메세지
   public static final int GAMEREADY=300;//게임 준비
   public static final int GAMESTART=310;//게임시작
   public static final int GAMEMUNJE=320;//문제출제
   public static final int GAMEDAP=330;//답 제출
   public static final int GAMEYESNO=340;//정답과 오답 전송
   public static final int GAMEEND=350; // 게임 종료
   // 채팅 관련
   public static final int CHAT=400;//채팅하기
   public static final int LOGOUT=500;//게임종료
} 
