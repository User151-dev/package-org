package Problem_;
import java.util.Random;
public class problempack {
    public static int _cAPI_(int crnt_num, int end_num, int plyr, int ch_){
        int j_ = 0;
        while(crnt_num < end_num){
            end_num=end_num-(ch_+1);
            j_ = j_+2;
        }
        if((crnt_num-end_num)%(ch_+1) != 0){
            return (plyr+j_-1)%2;
        }else{
            return (plyr+j_)%2;
        }
    }
    public static int _pAPI_(int min_,int plyr, int end_num,int ch_){
        int k_ = plyr%2;
        int p_ = ch_;
        Random random = new Random();
        while(k_ != _cAPI_(min_+p_, end_num, plyr, ch_)){
            p_ =p_-1;
            if(p_ == 0){
                int random_num = random.nextInt(ch_-1);
                return random_num+1;
            }
        }
        return p_;
    }
}
