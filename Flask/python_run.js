import {PythonShell} from 'python-shell';

PythonShell.run(
	'print_test.py',
	null,
	function (err) {
		if (err) throw err;
		console.log('finished')
	}
);