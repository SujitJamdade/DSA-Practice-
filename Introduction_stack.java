package Stack;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;

public class Introduction_stack {

    public static void main(String args[]){
        // 1. Create your stack
        Stack<Integer> st = new Stack<>();

        // 2. add any element
        st.push(10);
        System.out.println(st + " "+st.peek()+" "+st.size());
        st.push(20);
        System.out.println(st + " "+st.peek()+" "+st.size());
        st.push(30);
        System.out.println(st + " "+st.peek()+" "+st.size());
        st.push(40);
        System.out.println(st + " "+st.peek()+" "+st.size());

        // 3. pop()
//         removing element from top
        st.pop();
        System.out.println(st + " "+st.peek()+" "+st.size());
        st.pop();
        System.out.println(st + " "+st.peek()+" "+st.size());
        st.pop();
        System.out.println(st + " "+st.peek()+" "+st.size());
        st.pop();
        System.out.println(st + " "+st.peek()+" "+st.size()); // EmptyStackException if we are able to access peek element from empty stack

    }

}
