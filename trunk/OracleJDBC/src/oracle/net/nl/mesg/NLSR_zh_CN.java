package oracle.net.nl.mesg;

import java.util.ListResourceBundle;

public class NLSR_zh_CN extends ListResourceBundle {
    static final Object[][] contents = {
            { "NoFile-04600", "TNS-04600: 找不到文仄1�7 {0}" },
            { "FileReadError-04601", "TNS-04601: 读取参数文件时出锄1�7 {0}, 错误丄1�7 {1}" },
            { "SyntaxError-04602", "TNS-04602: 无效语法错误: 要求 \"{0}\" 圄1�7 {1} 的前面或之中" },
            { "UnexpectedChar-04603", "TNS-04603: 无效语法错误: 寄1�7 {1} 进行语法分析时遇到意外的字符 \"{0}\"" },
            { "ParseError-04604", "TNS-04604: 未初始化语法分析对象" },
            { "UnexpectedChar-04605", "TNS-04605: 无效语法错误: {1} 之前或之中出现意外的字符或文孄1�7 \"{0}\" " },
            { "NoLiterals-04610", "TNS-04610: 没有其他文字, 已到辄1�7 NV 对结射1�7" },
            { "InvalidChar-04611", "TNS-04611: 备注后存在无效的续行笄1�7" },
            { "NullRHS-04612", "TNS-04612: \"{0}\" 的1�7 RHS 为空" },
            { "Internal-04613", "TNS-04613: 内部错误: {0}" },
            { "NoNVPair-04614", "TNS-04614: 找不刄1�7 NV 寄1�7 {0}" },
            { "InvalidRHS-04615", "TNS-04615: {0} 的1�7 RHS 无效" } };

    public Object[][] getContents() {
        return contents;
    }
}

/*
 * Location: D:\oracle\product\10.2.0\client_1\jdbc\lib\ojdbc14_g.jar Qualified Name:
 * oracle.net.nl.mesg.NLSR_zh_CN JD-Core Version: 0.6.0
 */