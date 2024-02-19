package com.example.fragmentsproyect

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController

class SelectionFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_selection, container, false)
        val imgConan = root.findViewById<ImageView>(R.id.imgConan)
        val imgXena = root.findViewById<ImageView>(R.id.imgXena)

        imgConan.setOnClickListener{
            val action = SelectionFragmentDirections.actionSelectionFragmentToResultFragment(1)
            showAlertDialog(action,"Conan")
        }

        imgXena.setOnClickListener{
            val action = SelectionFragmentDirections.actionSelectionFragmentToResultFragment(2)
            showAlertDialog(action,"Xena")
        }

        return root
    }

    private fun showAlertDialog(action: NavDirections, warrior: String) {
        val builder = AlertDialog.Builder(requireContext())
            .setTitle("SELECCION DEL GUERRERO")
            .setMessage("¿Seguro que quieres seleccionar a $warrior ?")
            .setCancelable(false) // Evita que el usuario cierre el diálogo haciendo clic fuera de él o presionando el botón de retroceso
            .setPositiveButton("Aceptar") { dialog, _ -> // Acción cuando se hace clic en el botón "Aceptar"
                findNavController().navigate(action)
                dialog.dismiss() // Cierra el diálogo
            }
                .setNegativeButton("Cancelar") { dialog, _ ->  // Acción cuando se hace clic en el botón "Cancelar"
                dialog.dismiss() // Cierra el diálogo
            }
                    .show()
    }

}