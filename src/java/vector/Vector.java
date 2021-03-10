package vector;

import java.util.Objects;

public class Vector implements Cloneable {
    protected final int size;
    protected Double[] vector;

    public Vector(int size) {
        this.size = size;
        this.vector = new Double[size];
    }

    public Vector(Vector extVector) {
        this.size = extVector.size;
        this.vector = extVector.vector;
    }

    public Vector(Double[] extArray) {
        this.size = extArray.length;
        this.vector = extArray;
    }

    public Double[] toArray() {
        return vector;
    }

    public Double get(int index) {
        return vector[index];
    }

    public void put(int index, Double data) {
        vector[index] = data;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(vector[i]);
            if (i != size - 1)
                sb.append(", ");
        }
        sb.append("]\n");
        return sb.toString();
    }

    public Vector clone() {
        Double[] data = new Double[size];
        Vector m = null;
        try {
            m = (Vector) super.clone();
            for (int i = 0; i < size; i++) {
                m.put(i, this.vector[i]);
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return m;
    }

    public int hashCode() {
        int hashCode = 1;
        for (int i = 0; i < size; i++) {
            Double e = vector[i];
            hashCode = 31 * hashCode + (e == null ? 0 : e.hashCode());
        }
        return hashCode;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof Vector)) {
            return false;
        }

        Vector other = (Vector) o;
        if (this.size != other.size) {
            return false;
        }

        for (int i = 0; i < size; i++) {
            if (!Objects.equals(this.vector[i], other.vector[i])) {
                return false;
            }
        }

        return true;
    }

    public int size() {
        return size;
    }

}
