package ExceptionHandling;

public class Desk {

    int size;

    

        public Desk(int size) {
        this.size = size;
    }

    


        static{
            System.out.println("Static block execution");
        }




        @Override
        public String toString() {
            return "Desk [size=" + size + "]";
        }

        




        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + size;
            return result;
        }






        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Desk other = (Desk) obj;
            if (size != other.size)
                return false;
            return true;
        }






        public int getSize() {
            return size;
        }




        public void setSize(int size) {
            this.size = size;
        }
    
}
