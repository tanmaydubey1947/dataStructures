package designPatterns.creational;

// Eager Loading

// Class implementing Eager Loading
class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    // private constructor
    private EagerSingleton() {
        // Declaring it private prevents creation of its object using the new keyword
    }

    // Method to get the instance of class
    public static EagerSingleton getInstance() {
        return instance; // Always returns the same instance
    }
}


// Lazy Loading / On Demand

// Class implementing Lazy Loading
class LazySingleton {
    // Object declaration
    private static LazySingleton instance;

    // private constructor
    private LazySingleton() {
        // Declaring it private prevents creation of its object using the new keyword
    }

    // Method to get the instance of class
    public static LazySingleton getInstance() {
        // If the object is not created
        if (instance == null) {
            // A new object is created
            instance = new LazySingleton();
        }

        // Otherwise the already created object is returned
        return instance;
    }
}


// Singleton with Thread Safety

// Synchronized Method

class SingletonSynchronized {
    // Object declaration
    private static SingletonSynchronized instance;

    // Private constructor
    private SingletonSynchronized() {}

    // Synchronized keyword used
    public static synchronized SingletonSynchronized getInstance() {
        if (instance == null) {
            instance = new SingletonSynchronized();
        }
        return instance;
    }
}



// Double Check locking

class DoubleCheckLocking {
    // Volatile object declaration
    private static volatile DoubleCheckLocking instance;

    // Private constructor
    private DoubleCheckLocking() {}

    // Thread-safe method using double-checked locking
    public static DoubleCheckLocking getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckLocking.class) {
                if (instance == null) {
                    instance = new DoubleCheckLocking();
                }
            }
        }
        return instance;
    }
}


// Bill Pugh

class BillPugh {
    // Private constructor
    private BillPugh() {}

    // Static inner class to hold the Singleton instance
    private static class Holder {
        private static final BillPugh INSTANCE = new BillPugh();
    }

    // Public method to return the Singleton instance
    public static BillPugh getInstance() {
        return Holder.INSTANCE;
    }
}
