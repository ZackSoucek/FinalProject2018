public class HitBox {
    int width;
    int height;
    //might need position here too or instead
    //todo replace with something

    public HitBox(){
        width = 0;
        height = 0;
    }
    public HitBox(int w, int h, int x, int y){

        this.height = h;
        this.width = w;
    }
}
