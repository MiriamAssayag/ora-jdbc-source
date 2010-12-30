package oracle.net.nl.mesg;

import java.util.ListResourceBundle;

public class NLSR_ko extends ListResourceBundle {
    static final Object[][] contents = {
            { "NoFile-04600", "TNS-04600: 파일을1�7 찾을 숄1�7 없음: {0}" },
            { "FileReadError-04601", "TNS-04601: 매개별1�7숄1�7 파일 {0}을1�7(륄1�7) 읽는 줄1�7 오류 발생. 오류: {1}" },
            { "SyntaxError-04602",
                    "TNS-04602: 분1�7적합필1�7 구문 오류: {1} 아1�7 또는 해당 위치엄1�7 \"{0}\"을1�7(간1�7) 완1�7아1�7 필1�7" },
            { "UnexpectedChar-04603",
                    "TNS-04603: 분1�7적합필1�7 구문 오류: {1}을1�7 구문을1�7 분석하는 줄1�7 예상칄1�7 않은 문자 \"{0}\" 발생" },
            { "ParseError-04604", "TNS-04604: 구문 분석 객체간1�7 초기화되진1�7 않음" },
            { "UnexpectedChar-04605",
                    "TNS-04605: 분1�7적합필1�7 구문 오류: {1} 아1�7 또는 해당 위치엄1�7 예상칄1�7 않은 문자 또는 리터럄1�7 \"{0}\"을1�7(간1�7) 있음" },
            { "NoLiterals-04610", "TNS-04610: 남아 있는 리터럄1�7 없음. NV 쌍의 끝에 도달필1�7" },
            { "InvalidChar-04611", "TNS-04611: 설명 뒤에 분1�7적합필1�7 연속 문자간1�7 있음" },
            { "NullRHS-04612", "TNS-04612: \"{0}\"엄1�7 댄1�7필1�7 널인 RHS" },
            { "Internal-04613", "TNS-04613: 내부 오류: {0}" },
            { "NoNVPair-04614", "TNS-04614: NV 쌄1�7 {0}을1�7(륄1�7) 찾을 숄1�7 없음" },
            { "InvalidRHS-04615", "TNS-04615: {0}엄1�7 댄1�7필1�7 분1�7적합필1�7 RHS" } };

    public Object[][] getContents() {
        return contents;
    }
}

/*
 * Location: D:\oracle\product\10.2.0\client_1\jdbc\lib\ojdbc14_g.jar Qualified Name:
 * oracle.net.nl.mesg.NLSR_ko JD-Core Version: 0.6.0
 */