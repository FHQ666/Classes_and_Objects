import javax.xml.bind.DatatypeConverter;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TcpClient {
    public static void main(String[] args) throws Exception {
        String ipAddress = "192.168.1.10";
        int portNumber = 20019;
        String hexString1 = "FF0F0000000801FF301D";
        String hexString2 = "FF0F000000080100705D";
        byte[] byteArray1 = DatatypeConverter.parseHexBinary(hexString1);
        byte[] byteArray2 = DatatypeConverter.parseHexBinary(hexString2);
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            int n = scanner.nextInt();
            if(n == 1){
                Socket socket = new Socket(ipAddress, portNumber);
                OutputStream outputStream = socket.getOutputStream();
                outputStream.write(byteArray1);
            }
            if (n == 0){
                Socket socket = new Socket(ipAddress, portNumber);
                OutputStream outputStream = socket.getOutputStream();
                outputStream.write(byteArray2);
            }
        }
    }
}

