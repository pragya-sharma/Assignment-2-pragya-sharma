/*
 *  Created by IntelliJ IDEA.
 *  User: Pragya Sharma
 *  Date: 28-Mar-20
 *
 */
package problem2.main;


import problem1.mybst.MyBinarySearchTree;

import java.util.Scanner;



/*

 *  >  executable class

 *  >  use problem1.mybst.MyBinarySearchTree class for creating binary tree

 */

public class MyMain {

    public static void main(String[] args) {

        MyBinarySearchTree tree = new MyBinarySearchTree();

        Scanner scanner = new Scanner(System.in);

        /*

         * > taking only 7 inputs for simple demonstration with value 1,2,3,4,5,6,7

         */

        int i = 7;

        System.out.println("Please take only 7 inputs ...");

        while (i > 0) {

            try {

                tree.add(scanner.nextInt());

            } catch (Exception x) {

                System.out.println("You Entered invalid no. ... you are kicked :) ");

                break;

            }

            i--;

        }



        /*

         *   Running Pre-Order and Post-Order Traversals

         */


        MyBinarySearchTree.preOrder(tree.root);

        System.out.println();

        tree.postOrder(tree.root);



/*

*

* Input :> 4

                   2

                   6

                   1

                   3

                   5

                   7



**

 * > tree looks like

        *

                       4

                     /  \

                    2      6

                   / \    / \

                  1   3  5   7

*  The result is :

    a.)    4 2 1 3 6 5 7

    b.)    1 3 2 5 7 6 4

        So , b is correct and a is not.

*

**/

    }


}