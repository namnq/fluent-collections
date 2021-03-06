package fluent.collection.support;

import java.util.Collection;
import java.util.Objects;

import fluent.collection.FluentCollection;

public abstract class FluentCollectionSupport<E> implements FluentCollection<E> {
    // Fluent Collection operations
    @Override
    public FluentCollection<E> plus(E e) {
        add(Objects.requireNonNull(e, "e should not be null."));
        return this;
    }

    @Override
    public FluentCollection<E> plus(E e1, E e2) {
        add(Objects.requireNonNull(e1, "e1 should not be null."));
        add(Objects.requireNonNull(e2, "e2 should not be null."));
        return this;
    }

    @Override
    public FluentCollection<E> plus(E e1, E e2, E e3) {
        add(Objects.requireNonNull(e1, "e1 should not be null."));
        add(Objects.requireNonNull(e2, "e2 should not be null."));
        add(Objects.requireNonNull(e3, "e3 should not be null."));
        return this;
    }

    @Override
    public FluentCollection<E> plus(E e1, E e2, E e3, E e4) {
        add(Objects.requireNonNull(e1, "e1 should not be null."));
        add(Objects.requireNonNull(e2, "e2 should not be null."));
        add(Objects.requireNonNull(e3, "e3 should not be null."));
        add(Objects.requireNonNull(e4, "e4 should not be null."));
        return this;
    }

    @Override
    public FluentCollection<E> plus(E e1, E e2, E e3, E e4, E e5) {
        add(Objects.requireNonNull(e1, "e1 should not be null."));
        add(Objects.requireNonNull(e2, "e2 should not be null."));
        add(Objects.requireNonNull(e3, "e3 should not be null."));
        add(Objects.requireNonNull(e4, "e4 should not be null."));
        add(Objects.requireNonNull(e5, "e5 should not be null."));
        return this;
    }

    @Override
    public FluentCollection<E> plus(E e1, E e2, E e3, E e4, E e5, @SuppressWarnings("unchecked") E... rest) {
        add(Objects.requireNonNull(e1, "e1 should not be null."));
        add(Objects.requireNonNull(e2, "e2 should not be null."));
        add(Objects.requireNonNull(e3, "e3 should not be null."));
        add(Objects.requireNonNull(e4, "e4 should not be null."));
        add(Objects.requireNonNull(e5, "e5 should not be null."));
        for (E e : Objects.requireNonNull(rest, "rest should not be null.")) {
            add(Objects.requireNonNull(e, "rest's elements should not be null."));
        }
        return this;
    }

    @Override
    public FluentCollection<E> plus(Collection<? extends E> c) {
        for (E e : Objects.requireNonNull(c, "c should not be null.")) {
            add(Objects.requireNonNull(e, "c's elements should not be null."));
        }
        return this;
    }

    @Override
    public String toString() {
        return "FluentCollectionSupport [toString()=" + super.toString() + "]";
    }

}
