    package java_0702;

    import java.util.Scanner;

    /**
     * @program: doExercise
     * @description: 实现接口，输入候选人人数，姓名，投票人的人数，投票数，输出候选人的名字和得票数量
     * @author: fwb
     * @create: 2019-07-03 20:26
     **/
    interface AddCandidate{
        int name();
    }

    interface Vote{
        void doVote();
    }

    interface GetVoteResylt{
        void result();
    }

    interface clear{
        void cleared();
    }

    class comeTrue implements AddCandidate,Vote,GetVoteResylt,clear{

    //    int m = in.nextInt();//投票人人数
    //    String[] voteName = new String[m];//投票人所投的票的名称

        public int name() {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();//候选人人数
            String[] candaidateName = new String[n];//候选人名称
            for (int i = 0; i < n ; i++) {
                candaidateName[i] = in.nextLine();
            }
            return 1;
        }

        @Override
        public void doVote() {
        }

        @Override
        public void result() {
        }

        @Override
        public void cleared() {

        }
    }

    public class Ex2 {
        public static void main(String[] args) {
            AddCandidate add = new comeTrue();
            System.out.println(add.name());
        }
    }
