import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelsDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("src/InputImage.jpg");
            FileOutputStream fout = new FileOutputStream("src/output.jpg");
            
            FileChannel in = fin.getChannel();
            FileChannel out = fout.getChannel();
            long start=0;
            int bufferSize=2048;
            ByteBuffer buff = ByteBuffer.allocate(bufferSize);
            start= System.nanoTime();
//            while(in.read(buff) > 0){
//                buff.flip();
//                out.write(buff);
//                buff.clear();
//            }
            in.transferTo(0, in.size(), out);
            System.out.println("Time taken(ms) is "+((System.nanoTime()-start)/1000000));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
