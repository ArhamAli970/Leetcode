/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    static List<Integer> ans;
    public static void call(Node root){
        if(root==null){return;}
        List<Node> arr=root.children;
        for(int i=0;i<arr.size();i++){
            call(arr.get(i));
        }
        ans.add(root.val);
    }
    public List<Integer> postorder(Node root) {
        ans=new ArrayList<>();
        call(root);
        return ans;
        
    }
}