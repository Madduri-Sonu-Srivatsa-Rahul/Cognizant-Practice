class Search{
    public static Product linearSearch(Product[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if (arr[i].getId() == target){
                return arr[i];
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] arr, int target){
        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if (arr[mid].getId() == target){
                return arr[mid];
            } else if (arr[mid].getId() < target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args){
        Product[] products = {
            new Product(101, "Tablet", "Electronics"),
            new Product(102, "Phone", "Electronics"),
            new Product(103, "Laptop", "Electronics"),
            new Product(104, "Watch", "Accessories"),
            new Product(105, "Shoes", "Fashion")
        };

        Product result1 = linearSearch(products, 104);
        if (result1 != null) {
            System.out.println("Product found: " + result1.getName());
        } else {
            System.out.println("Product not found");
        }

        Product result2 = binarySearch(products, 102);
        if (result2 != null) {
            System.out.println("Product found: " + result2.getName());
        } else {
            System.out.println("Product not found");
        }
    }
}