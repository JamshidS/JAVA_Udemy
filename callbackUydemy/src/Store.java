public class Store {
    Member[] members =  new Member[100];
    int count = 0;
    void register(Member member){
        this.members[count++] = member;
    }

    void inviteSale(){
        for(int i=0;i<count;i++){
            members[i].callBack();
        }
    }
}
