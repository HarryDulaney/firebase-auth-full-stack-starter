import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators, NgModel } from '@angular/forms';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-converter',
  templateUrl: './converter.component.html',
  styleUrls: ['./converter.component.scss']
})
export class ConverterComponent implements OnInit {


  sourceFileValid: boolean = false;
  convertForm: FormGroup;
  imageFileTypes = ['.png', '.jpeg', '.gif', '.bmp'];
  wordFileTypes = ['.doc', '.docx', '.text', '.pdf'];
  excelFileTypes = ['.xls', '.csv', '.xlsx', '.bmp'];


  fileTypes = this.imageFileTypes;
  // targetFileModel: NgModel;
  constructor(
    userService: UserService) {
    this.convertForm = this.createFormGroup();
  }

  ngOnInit(): void {
    this.sourceFileValid = false;
  }

  createFormGroup(): FormGroup {
    return new FormGroup(
      {
        inputFile: new FormControl('', Validators.required),
        outputFile: new FormControl({ value: this.imageFileTypes, disabled: false }, Validators.required)
      }
    )
  }

  validateInputFile(event: any) {
    if (event.target !== null) {
      const file = event.target.files[0];
      // const filePath = fileURLToPath(file);
      if (file) {
        this.sourceFileValid = true;
        this.fileTypes = this.imageFileTypes;
      }
    }
  }

  convert(event: any) {
    if (event.target !== null) {
      const file = event.target.files[0];



    }
  }

}
