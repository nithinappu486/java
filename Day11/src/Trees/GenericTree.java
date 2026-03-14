package Trees;

public class GenericTree<X> {
    private final X data;
    private GenericTree<X> left;
    private GenericTree<X> right;
    public GenericTree(X data){
        this.data=data;
        this.left=this.right=null;
    }

    public static void main(String[] args) {
        //this is a tree of integers
        GenericTree<Integer> integerRoot=new GenericTree<>(1);
        integerRoot.left=new GenericTree<>(2);
        integerRoot.right=new GenericTree<>(3);
        //this is a tree of floats
        GenericTree<Float> floatRoot=new GenericTree<>(1.2f);
        floatRoot.left=new GenericTree<>(2.4f);
        floatRoot.right=new GenericTree<>(4.6f);
        //this is a tree of boolean
        GenericTree<Boolean> booleanRoot=new GenericTree<>(true);
        booleanRoot.left=new GenericTree<>(true);
        booleanRoot.right=new GenericTree<>(false);

    }

}
