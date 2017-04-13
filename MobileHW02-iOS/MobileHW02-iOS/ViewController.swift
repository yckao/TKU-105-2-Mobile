//
//  ViewController.swift
//  MobileHW02-iOS
//
//  Created by 高宜誠 on 2017/4/11.
//  Copyright © 2017年 高宜誠. All rights reserved.
//

import UIKit
import Toast_Swift
class ViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }
    @IBOutlet var lightBtn: UIButton!
    @IBAction func lightUp(_ sender: Any) {
        lightBtn.setBackgroundImage(UIImage(named: "Image"), for: UIControlState.normal)
        self.view.makeToast(NSLocalizedString("lightup", comment: ""), duration: 0.5, position: .bottom)
    }
    @IBAction func blackout(_ sender: Any) {
        lightBtn.setBackgroundImage(nil, for: UIControlState.normal)
        self.view.makeToast(NSLocalizedString("blackout", comment: ""), duration: 0.5, position: .bottom)
    }

    @IBAction func lightPress(_ sender: Any) {
        self.view.makeToast(NSLocalizedString("click", comment: ""), duration: 0.5, position: .bottom)
    }

}

