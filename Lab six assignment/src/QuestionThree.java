import java.util.Stack;
/**
 * Created by Mohamed Alshamsi on 18/2/2022.
 */
public class QuestionThree {
    static int evaluatePostfix(String exp)
    {
        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<exp.length();i++)
        {
            char c=exp.charAt(i);


            if(Character.isDigit(c))
                stack.push(c - '0');


            else
            {
                int val1 = stack.pop();
                int val2 = stack.pop();

                switch(c)
                {
                    case '+':
                        stack.push(val2+val1);
                        break;

                    case '-':
                        stack.push(val2- val1);
                        break;

                    case '/':
                        stack.push(val2/val1);
                        break;

                    case '*':
                        stack.push(val2*val1);
                        break;
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args)
    {
        String exp="426*+2-";
        System.out.println("Expression in normal form is ((2*6)+4)-2");
        System.out.println("Postfix expression to evaluate is 426*+2-");
        System.out.println("postfix evaluation: "+evaluatePostfix(exp));
    }
}
