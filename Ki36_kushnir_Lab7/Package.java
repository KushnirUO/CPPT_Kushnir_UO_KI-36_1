package Ki36_kushnir_Lab7;

import java.util.ArrayList;
import java.util.List;

/**
 * Safe class
 *
 * @author Andrii Stetsula
 * @version 1.0.0
 **/

public class Package<T extends Food>{

        /**
         * ArrayList as a container for objects
         **/
        private final List<T> arr;

        /**
         * Constructor for Package object
         **/
        public Package() {
            arr = new ArrayList<T>();
        }

        /**
         * method for finding max element from package
         *
         * @return max element in array
         **/
        public T findMax() {
            if (!arr.isEmpty()) {
                T max = arr.get(0);
                for (int i = 1; i < arr.size(); i++) {
                    if (arr.get(i).compareTo(max) > 0)
                        max = arr.get(i);
                }
                return max;
            }
            return null;
        }

        /**
         * method for adding food to safe
         *
         * @param food as a element in safe
         **/
        public void AddFood(T food) {
            arr.add(food);
            System.out.print("Element added: ");
            food.output();
        }

        /**
         * method for deleting food from safe
         *
         * @param i as index in array
         **/
        public void DeleteFood(int i) {
            arr.remove(i);
        }
        /**
         * method for printing all food from package
         *
         *
         **/
        public void printAll(){
            for (T instrument: arr)
                instrument.output();
        }
    }

