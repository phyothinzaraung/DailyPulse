//
//  AboutScreen.swift
//  iosApp
//
//  Created by Phyo Thinzar Aung on 13/01/2025.
//  Copyright © 2025 orgName. All rights reserved.
//

import SwiftUI

struct AboutScreen: View {
    var body: some View {
        NavigationStack{
            AboutListView()
                .navigationTitle("About Device")
        }
    }
}

#Preview {
    AboutScreen()
}
