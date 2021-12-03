
//店内无猫可rua(即猫咪总数小于0)时候抛出
public class CatNotFoundException extends  RuntimeException{
    public CatNotFoundException(String msg){
        super(msg);

    }


}
