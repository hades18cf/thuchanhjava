A[i] = scanner.nextInt();​

    }​

   // Tính tổng các số chẵn có trong mảng​

    double Tong =0;​

    for (int i = 0; i < n; i++)// {​

        if (A[i] % 2 == 0) {​

            Tong+=A[i];​

        }​

    }​

    System.out.println("Tỏng: " + Tong);​

   }​
