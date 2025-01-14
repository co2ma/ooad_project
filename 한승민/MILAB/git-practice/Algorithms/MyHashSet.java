import java.util.ArrayList;

class MyHashSet {
    private List<Integer> myHashSet;

    public MyHashSet() {
        myHashSet = new ArrayList<>();
    }
    
    public void add(int key) {
        // 중복 없으면 추가
        if (!(myHashSet.contains(key))){
            myHashSet.add(key);
        }   
    }
    
    public void remove(int key) {
        
        // 있으면 삭제
        if(myHashSet.contains(key) == true){
            myHashSet.remove((Integer)key);
        }
        // 없으면 패스
    }
    
    public boolean contains(int key) {
        // 전 구간 순회
        for(int i=0; i<myHashSet.size(); i++){
            // 찾아
            if(myHashSet.get(i) == key){
                return true;
            }
        }
        // 못 찾음
        return false;
    }
}
