public class Dragon03 {
    int x, y, width, height;

    Dragon03 (int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    
    void moveLeft() {
        x -= 1;
        if (x < 0 ) {
            detectCollision(x, y);   
        }
    }

    void moveRight() {
        x += 1;
        if (x > width) {
            detectCollision(x, y);   
        }
    }

    void moveUp() {
        y -= 1;
        if (y < 0) {
            detectCollision(x, y);
        }
    }

    void moveDown() {
        y += 1;
        if (y > height) {
            detectCollision(x, y);
        }
    }

    void printPosition() {
        System.out.printf("\nKoordinat Dragon : (%d, %d)\n", x, y);
    }

    void detectCollision(int x, int y) {
        if (x < 0 || x > width || y < 0 || y > height) {
            System.out.println("\nGame Over!");
            System.exit(0);
        }
    }
}
