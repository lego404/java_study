package sec02.exam02;
import java.io.*;
/*
 * 파일 복사 성능 테스트
 */
public class NonBufferVsBufferExample {
	public static void main(String[]args) throws Exception {
		/*
		//기본 스트림 생성 
		String originalFilePath1 = NonBufferVsBufferExample.class.getResource("originalFile1.jpg").getPath();
		String targetFilePath1 = "C:/Temp/targetFile1.jpg";
		FileInputStream fis = new FileInputStream(originalFilePath1);
		FileOutputStream fos = new FileOutputStream(targetFilePath1);
		
		//버퍼 보조 스트림 연결
		String originalFilePath2 = NonBufferVsBufferExample.class.getResource("originalFile1.jpg").getPath();
		String targetFilePath2 = "C:/Temp/targetFile2.jpg";
		FileInputStream fis2 = new FileInputStream(originalFilePath2);
		FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
		오류나염^^... 
		*/
		///*
		String originalFilePath1 = "C:/Temp/originalFile1.jpg";
		String targetFilePath1 = "C:/Temp/targetFile1.jpg";
        FileInputStream fis = new FileInputStream(originalFilePath1);
        FileOutputStream fos = new FileOutputStream(targetFilePath1);
        
        String originalFilePath2 = "C:/Temp/originalFile2.jpg";
        String targetFilePath2 = "C:/Temp/targetFile2.jpg";
        FileInputStream fis2 = new FileInputStream(originalFilePath2);
        FileOutputStream fos2= new FileOutputStream(targetFilePath2);    
		// */
        /* Path를 가져오는 부분이 문제인듯 (어케함?)
         * 그냥 경로를 직접 가져오면 작동 되는데 getPath는 나중에 더 배우면... 
         * +) fis, fos 부분은 File~ 떼고 입력스트림만 해도 됨 
         */
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		//FileInputStream, FileOutputStream을 이용한 복사 시간 측정 
		long nonBufferTime = copy(fis, fos);
		System.out.println("버퍼를 사용하지 않았을 때:\t" + nonBufferTime + "ns");
		
		//BufferedInputStream, BufferedOutputStream을 이용한 복사 시간 측정
		long bufferTime = copy(bis, fos);
		System.out.println("버퍼를 사용했을 때:\t\t" + bufferTime + "ns");
		
		fis.close();
		fos.close();
		bis.close();
		bos.close();
	}
	
	static int data = -1;
	public static long copy(InputStream is, OutputStream os) throws Exception {
		long start = System.nanoTime();	//시작 시간 설정
		//[파일복사] 원본파일에서 읽은 1byte를 타겟 파일로 바로 출력
		while(true) {
			data =is.read();
			if(data==-1) break;
			os.write(data);
		}
		os.flush();
		//여기까지 파일복사
		
		long end = System.nanoTime();
		return (end-start);
	}
}
