import React, { useState } from 'react'
import {addRoom} from "../util/ApiFuncation"
const AddRoom = () => {

    const[newRoom,setNewRoom]=useState({
        photo:null,
        roomType:"",
        roomPrice:""
    })

    const[imagePreview,setImagePreview]=useState("")
    const[successMessage,setSuccessMessage]=useState("")
    const[errorMessage,setErrorMessage]=useState("")
    const handelRoomInputChange=(e)=>{
            const name=e.target.name
            let value=e.target.value

            if(name==="roomPrice")
            {
                if(!isNaN(value))
                {
                    value.parseInt(value)
                }
                else
                {
                    value=""
                }
            }
            setNewRoom({...newRoom,[name]:value})
    }
    const handleImageChange=(e)=>
    {
        const selectedImage=e.target.files[0]
        setNewRoom({...newRoom,photo:selectedImage})
        setImagePreview(URL.createObjectURL(selectedImage))
    }

    const handleSubmit=async (e)=>
    {
        e.preventDefault()
        try{
                const success= await addRoom(newRoom.photo,newRoom.roomType,newRoom.roomPrice)
                if(success !==undefined)
                {
                        setSuccessMessage("A new Room Added in database")
                        setNewRoom({photo:null,roomType:"",roomPrice:""})
                        setImagePreview("")
                        setErrorMessage("")
                }
                else
                {
                    setErrorMessage("Error Adding room")
                }
        }
        catch(error)
        {
            setErrorMessage(error.message)
        }
    }

  return (
    <div>
        <section className='conrainer,mt-5 mb-5'>
            <div className='row justify-content-center'>

                <div className='col-md-8 col-lg-6'>
                    <h2 className='mt-5 mb-2'>
                        Add A new Room
                    </h2>
                    <form onSubmit={handleSubmit}>
                        <div className='mb-3'>
                            <label  htmlFor='roomType' className='form-label'>Room type</label>
                            <div></div>
                        </div>

                        <div className='mb-3'>
                            <label  htmlFor='roomPrice' className='form-label'>Room Price</label>
                            <input className='form-control' type='number' required id='roomPrice' name='roomPrice' value={newRoom.roomPrice} onChange={handelRoomInputChange}></input>
                        </div>

                        <div className='mb-3'>
                            <label  htmlFor='photo' className='form-label'>Room Photo</label>
                            <input id='photo' name='photo' type='file' className='form-control' onChange={handleImageChange}></input>
                            {imagePreview && (<img src={imagePreview} alt='Preview Room Photo' style={{maxWidth:"400px"}}></img>)}
                        </div>
                    </form>

                </div>

            </div>
        </section>
    </div>
  )
}

export default AddRoom