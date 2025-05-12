package chapter8.labs.lab1;

import java.util.Objects;

public class Pair<K, V> {
    private K key;
    private V value;

    public Pair() {}

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() { return key; }
    public V getValue() { return value; }

    public void setKey(K key) { this.key = key; }
    public void setValue(V value) { this.value = value; }

    @Override
    public String toString() {
        return "Pair{key=" + key + ", value=" + value + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pair<?, ?>)) return false;
        Pair<?, ?> p = (Pair<?, ?>) o;
        return Objects.equals(key, p.key) && Objects.equals(value, p.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }
}
