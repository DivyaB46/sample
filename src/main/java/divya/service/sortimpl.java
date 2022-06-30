package divya.service;

import org.springframework.stereotype.Service;

import divya.repo.divyainterface;

@Service
public class sortimpl implements divyainterface {
	@Override
	public void bubblesort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }

	
	

}
