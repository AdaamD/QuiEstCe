import javax.swing.JFrame;

public class BoxedFrame {
    private JFrame frame;
    public BoxedFrame(JFrame f){
        frame = f;
    }
    public void set (JFrame f){
        frame = f;
    }
    public JFrame get (){
        return frame; 

    }
}