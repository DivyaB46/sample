package divya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import divya.repo.divyainterface;


@RestController
public class divyacontroller {
@Autowired
private divyainterface obj;

@GetMapping("/bsort")
public int[]  bsort(@RequestBody int[] array) {
	obj.bubblesort(array);
	return array;
}


}
