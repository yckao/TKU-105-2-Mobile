//
//  ViewController.swift
//  MobileHW1-iOS
//
//  Created by 高宜誠 on 2017/3/13.
//  Copyright © 2017年 高宜誠. All rights reserved.
//

import UIKit

class ViewController: UIViewController {
    @IBOutlet var nameTextField: UITextField!
    @IBOutlet var nameLabel: UILabel!
    @IBOutlet var emailLabel: UILabel!
    @IBOutlet var emailTextField: UITextField!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }

    @IBAction func enter(_ sender: Any) {
        self.nameLabel.text = self.nameTextField.text
        self.emailLabel.text = self.emailTextField.text
    }
    
    @IBAction func clean(_ sender: Any) {
        self.nameLabel.text = "";
        self.emailLabel.text = "";
        self.nameTextField.text = "";
        self.emailTextField.text = "";
    }

    @IBAction func endEditing(_ sender: UITextField) {
        sender.resignFirstResponder()
    }
}

