package com.hanifusion.graph;

import java.util.Scanner;

public class AdjacencyMatrix {
    static int[][] matrix = new int[20][20];//2D array that will contain the graph

    public static void main(String[] args) {
        int e = 7, n = 5;//e is number of edges, n is number of vertices
        inMatrix(e);
        System.out.println("output: ");
        for (var i = 0; i < n; i++) {
            for (var j = 0; j < n; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }

    }

    public static void inMatrix(int e) {
        char j, k;
        var scanner = new Scanner(System.in);

        System.out.println("Enter the Edges: ");
        for (var i = 0; i < e; i++)//this loops runs e time to take the all edges
        {
            j = scanner.next().charAt(0);
            k = scanner.next().charAt(0);
            matrix[(int) j - 65][(int) k - 65] = matrix[(int) k - 65][(int) j - 65] = 1;
            //undirected edges has both ways access between the nodes
            //if A to B has a way to go then B to A has the same way
        }

    }
}
